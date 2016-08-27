import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String organizer_description;
	public int id;
	public String location_name;
	public String end_time;
	public VersionModel _version;
	public String state;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public String description;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String topic;
	public String logo;

	public RootModel(String start_time, String background_image, Call_for_papersModel call_for_papers, String organizer_name, String organizer_description, int id, String location_name, String end_time, VersionModel version, String state, CopyrightModel copyright, String privacy, String timezone, String schedule_published_on, String email, String code_of_conduct, String description, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String type, String topic, String logo) {

		this.start_time = start_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.location_name = location_name;
		this.end_time = end_time;
		this._version = version;
		this.state = state;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.type = type;
		this.topic = topic;
		this.logo = logo;

	}

}