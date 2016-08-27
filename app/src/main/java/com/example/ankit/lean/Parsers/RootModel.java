import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String start_time;
	public int id;
	public String background_image;
	public String location_name;
	public String timezone;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String description;
	public String state;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String email;

	public RootModel(String organizer_name, String type, String start_time, int id, String background_image, String location_name, String timezone, String end_time, CreatorModel creator, String organizer_description, String topic, Call_for_papersModel call_for_papers, CopyrightModel copyright, VersionModel version, String logo, ArrayList<Social_linksModel> social_links, String schedule_published_on, String description, String state, String privacy, String name, String code_of_conduct, String email) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.location_name = location_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._version = version;
		this.logo = logo;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;

	}

}