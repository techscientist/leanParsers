import java.util.ArrayList;

class RootModel {

	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String description;
	public String name;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;
	public String background_image;
	public String end_time;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String state;
	public int id;
	public String topic;
	public String type;

	public RootModel(String logo, CreatorModel creator, String organizer_description, String description, String name, CopyrightModel copyright, String privacy, String timezone, String background_image, String end_time, String code_of_conduct, String email, String location_name, String start_time, Call_for_papersModel call_for_papers, VersionModel version, String schedule_published_on, ArrayList<Social_linksModel> social_links, String organizer_name, String state, int id, String topic, String type) {

		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.description = description;
		this.name = name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.state = state;
		this.id = id;
		this.topic = topic;
		this.type = type;

	}

}