import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String timezone;
	public String background_image;
	public String schedule_published_on;
	public String code_of_conduct;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String location_name;
	public int id;
	public String organizer_description;
	public String description;
	public String logo;
	public String start_time;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String end_time;
	public String topic;
	public String type;
	public String email;

	public RootModel(String privacy, String timezone, String background_image, String schedule_published_on, String code_of_conduct, String state, Call_for_papersModel call_for_papers, String name, CreatorModel creator, ArrayList<Social_linksModel> social_links, VersionModel version, String location_name, int id, String organizer_description, String description, String logo, String start_time, CopyrightModel copyright, String organizer_name, String end_time, String topic, String type, String email) {

		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.social_links = social_links;
		this._version = version;
		this.location_name = location_name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.start_time = start_time;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.topic = topic;
		this.type = type;
		this.email = email;

	}

}