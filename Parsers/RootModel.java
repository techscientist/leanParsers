import java.util.ArrayList;

class RootModel {

	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String state;
	public String logo;
	public String location_name;
	public String description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public String organizer_description;
	public String type;
	public String timezone;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String privacy;
	public CopyrightModel _copyright;
	public String name;
	public String organizer_name;
	public int id;
	public String email;

	public RootModel(String background_image, ArrayList<Social_linksModel> social_links, VersionModel version, String state, String logo, String location_name, String description, String end_time, Call_for_papersModel call_for_papers, String topic, String start_time, String organizer_description, String type, String timezone, String code_of_conduct, CreatorModel creator, String schedule_published_on, String privacy, CopyrightModel copyright, String name, String organizer_name, int id, String email) {

		this.background_image = background_image;
		this.social_links = social_links;
		this._version = version;
		this.state = state;
		this.logo = logo;
		this.location_name = location_name;
		this.description = description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._copyright = copyright;
		this.name = name;
		this.organizer_name = organizer_name;
		this.id = id;
		this.email = email;

	}

}