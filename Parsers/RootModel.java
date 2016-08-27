import java.util.ArrayList;

class RootModel {

	public String email;
	public String code_of_conduct;
	public String logo;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String organizer_name;
	public String state;
	public String privacy;
	public String timezone;
	public int id;
	public String location_name;
	public String description;
	public VersionModel _version;

	public RootModel(String email, String code_of_conduct, String logo, String schedule_published_on, String end_time, String topic, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String name, CreatorModel creator, String start_time, String organizer_description, CopyrightModel copyright, String type, String background_image, String organizer_name, String state, String privacy, String timezone, int id, String location_name, String description, VersionModel version) {

		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.state = state;
		this.privacy = privacy;
		this.timezone = timezone;
		this.id = id;
		this.location_name = location_name;
		this.description = description;
		this._version = version;

	}

}